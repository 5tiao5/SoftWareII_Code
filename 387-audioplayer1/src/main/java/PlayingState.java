class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
        name = "Playing";
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState
        LockedState lockedState=new LockedState(player);
        player.changeState(lockedState);
    }

    public void clickPlay() {
        //todo:add code here
        //stop playing
        //change state to ReadyState
        ReadyState readyState=new ReadyState(this.player);
        player.changeState(readyState);
    }

    public void clickNext() {
        // Implement event handling for double-click
        player.nextSong();
    }

    public void clickPrevious() {
        // Implement event handling for double-click
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