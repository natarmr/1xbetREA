.class public final La/s660;
.super La/q3k;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(La/kzj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s660;->c:B

    invoke-direct {p0, p1}, La/q3k;-><init>(La/kzj0;)V

    return-void
.end method


# virtual methods
.method public final U()Z
    .locals 0

    .line 1
    iget-byte p0, p0, La/s660;->c:B

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x1

    return p0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r0(La/kzj0;)La/p3k;
    .locals 1

    .line 1
    iget-byte p0, p0, La/s660;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/s660;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, La/s660;-><init>(La/kzj0;B)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance p0, La/s660;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, La/s660;-><init>(La/kzj0;B)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
