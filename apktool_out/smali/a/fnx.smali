.class public abstract La/fnx;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public final synthetic o:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fnx;->o:B

    invoke-direct {p0}, La/lm40;-><init>()V

    return-void
.end method


# virtual methods
.method public U(La/c810;La/pj30;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/fnx;->o:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, La/pj30;->P(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, La/pj30;->P(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

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

.method public abstract Z0(La/pj30;J)J
.end method

.method public abstract a1()Z
.end method

.method public c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-virtual {p0, p2, p3, p4}, La/fnx;->Z0(La/pj30;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, La/fnx;->a1()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p3, p4, v0, v1}, La/r4e;->e(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    :cond_0
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p2, p0, La/pu90;->a:I

    .line 20
    .line 21
    iget p3, p0, La/pu90;->b:I

    .line 22
    .line 23
    new-instance p4, La/cam;

    .line 24
    .line 25
    const/16 v0, 0x9

    .line 26
    .line 27
    invoke-direct {p4, p0, v0}, La/cam;-><init>(La/pu90;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public e0(La/c810;La/pj30;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/fnx;->o:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, La/pj30;->L(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, La/pj30;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

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

.method public v(La/c810;La/pj30;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/fnx;->o:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, La/pj30;->b(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, La/pj30;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

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

.method public w(La/c810;La/pj30;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/fnx;->o:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, La/pj30;->D(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, La/pj30;->D(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

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
