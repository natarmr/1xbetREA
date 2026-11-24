.class public final La/yr50;
.super La/i26;
.source "SourceFile"


# instance fields
.field public final synthetic g:B

.field public final h:Ljava/lang/Object;

.field public final i:La/wdr;


# direct methods
.method public synthetic constructor <init>(BLa/wdr;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iput-byte p1, p0, La/yr50;->g:B

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, La/i26;-><init>(ILjava/util/List;)V

    iput-object p3, p0, La/yr50;->h:Ljava/lang/Object;

    iput-object p2, p0, La/yr50;->i:La/wdr;

    return-void
.end method


# virtual methods
.method public final A(I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/yr50;->g:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget p0, La/rij;->x:I

    .line 7
    .line 8
    const p0, 0x7f0d046b

    .line 9
    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_0
    const p0, 0x7f0d037a

    .line 13
    .line 14
    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Landroid/view/View;)La/v46;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yr50;->g:B

    .line 2
    .line 3
    iget-object v1, p0, La/yr50;->i:La/wdr;

    .line 4
    .line 5
    iget-object p0, p0, La/yr50;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, La/rij;

    .line 14
    .line 15
    check-cast p0, La/avs0;

    .line 16
    .line 17
    check-cast v1, La/g6v0;

    .line 18
    .line 19
    invoke-direct {v0, p1, p0, v1}, La/rij;-><init>(Landroid/view/View;La/avs0;La/g6v0;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/zr50;

    .line 24
    .line 25
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    check-cast v1, La/jt50;

    .line 28
    .line 29
    invoke-direct {v0, p1, p0, v1}, La/zr50;-><init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/jt50;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
