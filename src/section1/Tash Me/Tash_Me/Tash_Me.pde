PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend.jpg");
size(800, 600);
friend.resize(width,height);
image(mustache, 150, 400);
}
