.class public final La/rv9;
.super La/jv9;
.source "SourceFile"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(BILjava/lang/reflect/Method;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/rv9;->f:B

    invoke-direct {p0, p3, p4, p2}, La/jv9;-><init>(Ljava/lang/reflect/Method;ZI)V

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rv9;->f:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    array-length v0, p1

    .line 13
    invoke-virtual {p0, v0}, La/sv9;->d(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v3, p1}, La/jv9;->g(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    array-length v0, p1

    .line 22
    invoke-virtual {p0, v0}, La/sv9;->d(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, La/sv9;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    array-length v0, p1

    .line 33
    if-gt v0, v2, :cond_0

    .line 34
    .line 35
    new-array p1, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    array-length v0, p1

    .line 39
    invoke-static {p1, v2, v0}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    invoke-virtual {p0, v3, p1}, La/jv9;->g(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    array-length v0, p1

    .line 49
    invoke-virtual {p0, v0}, La/sv9;->d(I)V

    .line 50
    .line 51
    .line 52
    aget-object v0, p1, v1

    .line 53
    .line 54
    array-length v3, p1

    .line 55
    if-gt v3, v2, :cond_1

    .line 56
    .line 57
    new-array p1, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    array-length v1, p1

    .line 61
    invoke-static {p1, v2, v1}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_1
    invoke-virtual {p0, v0, p1}, La/jv9;->g(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
