public interface IRunAndJump {
    default boolean go(Treadmill treadmill1) {
        return false;
    }

    default boolean jump(Wall wall1) {
        return false;
    }
}
