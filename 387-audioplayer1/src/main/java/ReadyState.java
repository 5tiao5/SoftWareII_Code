class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        //todo:add code here
        // call super constructor
        // initialize name
        super(player);
        name="Ready";
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState
        LockedState lockedState=new LockedState(player);
        player.changeState(lockedState);
    }

    public void clickPlay() {
        //todo:add code here
        //start playing
        //change state to PlayingState
        PlayingState playingState=new PlayingState(player);
        player.changeState(playingState);
    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
        player.previousSong();
    }

    public  void clickUp(){
        //todo:add code here
        //increase volume
        player.increaseVolume();
    };

    public  void clickDown(){
        //todo:add code here
        //decrease volume
        player.decreaseVolume();
    }

}
