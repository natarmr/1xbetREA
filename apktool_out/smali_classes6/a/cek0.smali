.class public abstract La/cek0;
.super La/lek0;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:I


# direct methods
.method public constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cek0;->c:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p2, p1}, La/lek0;-><init>(ZI)V

    .line 8
    .line 9
    .line 10
    iput p1, p0, La/cek0;->d:I

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/4 p2, 0x1

    .line 14
    invoke-direct {p0, p2, p1}, La/lek0;-><init>(ZI)V

    .line 15
    .line 16
    .line 17
    iput p1, p0, La/cek0;->d:I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/cek0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, La/cek0;->d:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, La/cek0;->d:I

    .line 10
    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
