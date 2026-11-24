.class public final La/k44;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/oif0;


# direct methods
.method public constructor <init>(La/oif0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k44;->a:La/oif0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/k44;->a:La/oif0;

    .line 2
    .line 3
    iget-object p0, p0, La/oif0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/l44;

    .line 6
    .line 7
    iget-object p0, p0, La/l44;->i:La/vg00;

    .line 8
    .line 9
    new-instance p1, La/jf4;

    .line 10
    .line 11
    const/16 p2, 0x12

    .line 12
    .line 13
    invoke-direct {p1, p2}, La/jf4;-><init>(B)V

    .line 14
    .line 15
    .line 16
    const/4 p2, -0x1

    .line 17
    invoke-virtual {p0, p2, p1}, La/vg00;->e(ILa/sg00;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/k44;->a:La/oif0;

    .line 2
    .line 3
    iget-object p0, p0, La/oif0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/l44;

    .line 6
    .line 7
    iget-object p0, p0, La/l44;->i:La/vg00;

    .line 8
    .line 9
    new-instance p1, La/jf4;

    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    invoke-direct {p1, v0}, La/jf4;-><init>(B)V

    .line 14
    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p0, v0, p1}, La/vg00;->e(ILa/sg00;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/k44;->a:La/oif0;

    .line 2
    .line 3
    iget-object p0, p0, La/oif0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/l44;

    .line 6
    .line 7
    iget-object p0, p0, La/l44;->i:La/vg00;

    .line 8
    .line 9
    new-instance p1, La/jf4;

    .line 10
    .line 11
    const/16 v0, 0x12

    .line 12
    .line 13
    invoke-direct {p1, v0}, La/jf4;-><init>(B)V

    .line 14
    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p0, v0, p1}, La/vg00;->e(ILa/sg00;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
