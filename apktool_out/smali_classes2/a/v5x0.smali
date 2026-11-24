.class public final synthetic La/v5x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yy3;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v5x0;->a:B

    iput-object p1, p0, La/v5x0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)La/ig00;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v5x0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v5x0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/i8x0;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Void;

    .line 11
    .line 12
    iget-object p0, p0, La/i8x0;->e:La/lin0;

    .line 13
    .line 14
    invoke-interface {p0}, La/lin0;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/ig00;

    .line 19
    .line 20
    invoke-static {p0}, La/hkb;->J(La/ig00;)La/ig00;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p0, La/glt0;

    .line 26
    .line 27
    check-cast p1, La/y7x0;

    .line 28
    .line 29
    new-instance v0, La/nxw0;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, La/nxw0;-><init>(La/glt0;La/y7x0;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/glt0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/c1x0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/c1x0;->a()La/fr40;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, La/trs0;

    .line 43
    .line 44
    invoke-direct {p1, v0}, La/trs0;-><init>(Ljava/util/concurrent/Callable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/fr40;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_1
    check-cast p0, La/l6x0;

    .line 52
    .line 53
    check-cast p1, La/s2x0;

    .line 54
    .line 55
    iget p1, p1, La/s2x0;->a:I

    .line 56
    .line 57
    const/16 v0, 0x733d

    .line 58
    .line 59
    if-eq p1, v0, :cond_0

    .line 60
    .line 61
    const/16 v0, 0x7361

    .line 62
    .line 63
    if-eq p1, v0, :cond_0

    .line 64
    .line 65
    const/16 v0, 0x7362

    .line 66
    .line 67
    if-eq p1, v0, :cond_0

    .line 68
    .line 69
    const/16 v0, 0x7363

    .line 70
    .line 71
    if-eq p1, v0, :cond_0

    .line 72
    .line 73
    const/16 v0, 0x7364

    .line 74
    .line 75
    if-eq p1, v0, :cond_0

    .line 76
    .line 77
    const/16 v0, 0x7365

    .line 78
    .line 79
    if-eq p1, v0, :cond_0

    .line 80
    .line 81
    const/16 v0, 0x7366

    .line 82
    .line 83
    if-eq p1, v0, :cond_0

    .line 84
    .line 85
    const/16 v0, 0x7367

    .line 86
    .line 87
    if-eq p1, v0, :cond_0

    .line 88
    .line 89
    const/16 v0, 0x7368

    .line 90
    .line 91
    if-ne p1, v0, :cond_1

    .line 92
    .line 93
    :cond_0
    iget-object p1, p0, La/l6x0;->g:La/glt0;

    .line 94
    .line 95
    invoke-virtual {p1}, La/glt0;->l()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0}, La/l6x0;->b()V

    .line 102
    .line 103
    .line 104
    :cond_1
    sget-object p0, La/n3x;->b:La/n3x;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
