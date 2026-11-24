.class public final La/mfx;
.super La/c2;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>([BB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mfx;->c:B

    const/16 p2, 0xa

    invoke-direct {p0, p1, p2}, La/c2;-><init>([BB)V

    return-void
.end method


# virtual methods
.method public final w([BI)La/lfx;
    .locals 1

    .line 1
    iget-byte p0, p0, La/mfx;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/kfx;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, p2, v0}, La/kfx;-><init>([BIB)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance p0, La/kfx;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, La/kfx;-><init>([BIB)V

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
