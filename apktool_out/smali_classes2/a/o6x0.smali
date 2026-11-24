.class public final synthetic La/o6x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g5x0;
.implements La/c7x0;


# virtual methods
.method public a(La/atm0;)La/vkr0;
    .locals 0

    sget-object p0, La/gfk0;->h:La/gfk0;

    check-cast p1, La/o5x0;

    .line 23
    iget-object p1, p1, La/o5x0;->a:La/vkr0;

    .line 24
    invoke-static {p1, p0}, La/o5x0;->u(La/vkr0;La/gfk0;)V

    return-object p1
.end method

.method public a(La/atm0;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, La/f9x0;

    .line 2
    .line 3
    check-cast p1, La/h8x0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-static {p1}, La/esw0;->b(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    .line 17
    .line 18
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method
