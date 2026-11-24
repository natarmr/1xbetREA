.class public final La/wh90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/khy;


# instance fields
.field public final synthetic a:B

.field public final b:La/xh90;


# direct methods
.method public constructor <init>(La/vh90;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/wh90;->a:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, La/xh90;

    .line 10
    .line 11
    iget-object v0, p1, La/vh90;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p2, v0, p1}, La/xh90;-><init>(Ljava/lang/Object;La/vh90;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/wh90;->b:La/xh90;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/xh90;

    .line 23
    .line 24
    iget-object v0, p1, La/vh90;->b:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {p2, v0, p1}, La/xh90;-><init>(Ljava/lang/Object;La/vh90;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/wh90;->b:La/xh90;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, La/xh90;

    .line 36
    .line 37
    iget-object v0, p1, La/vh90;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {p2, v0, p1}, La/xh90;-><init>(Ljava/lang/Object;La/vh90;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/wh90;->b:La/xh90;

    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/wh90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wh90;->b:La/xh90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/xh90;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, La/xh90;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, La/xh90;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wh90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wh90;->b:La/xh90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/xh90;->a()La/wb00;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, La/wb00;->a:Ljava/lang/Object;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, La/xh90;->a()La/wb00;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/xh90;->c:Ljava/lang/Object;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    invoke-virtual {p0}, La/xh90;->a()La/wb00;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, La/my40;

    .line 26
    .line 27
    iget-object v2, p0, La/xh90;->b:La/vh90;

    .line 28
    .line 29
    iget-object p0, p0, La/xh90;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {v1, v2, p0, v0}, La/my40;-><init>(La/vh90;Ljava/lang/Object;La/wb00;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/wh90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wh90;->b:La/xh90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/xh90;->remove()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, La/xh90;->remove()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-virtual {p0}, La/xh90;->remove()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
