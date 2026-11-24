.class public final synthetic La/o0v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u0v0;


# direct methods
.method public synthetic constructor <init>(La/u0v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o0v0;->a:B

    iput-object p1, p0, La/o0v0;->b:La/u0v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/o0v0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/o0v0;->b:La/u0v0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    iget-object p0, p0, La/u0v0;->r:La/zx10;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v0, La/r040;->e:La/r040;

    .line 18
    .line 19
    invoke-static {p0, v0, v2, v1}, La/zx10;->k(La/zx10;La/r040;ZI)Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/y0w0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/y0w0;-><init>(La/m7h0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 38
    .line 39
    iget-object p0, p0, La/u0v0;->r:La/zx10;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v0, La/r040;->g:La/r040;

    .line 45
    .line 46
    invoke-static {p0, v0, v2, v1}, La/zx10;->k(La/zx10;La/r040;ZI)Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/y0w0;

    .line 54
    .line 55
    invoke-direct {v0, p0}, La/y0w0;-><init>(La/m7h0;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    instance-of v0, p1, La/zhi0;

    .line 70
    .line 71
    iget-object v1, p0, La/u0v0;->s:La/zg;

    .line 72
    .line 73
    const-string v2, "delete_bill_error"

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    check-cast v0, La/zhi0;

    .line 79
    .line 80
    iget v0, v0, La/zhi0;->a:I

    .line 81
    .line 82
    iget-object v1, v1, La/zg;->a:La/kt2;

    .line 83
    .line 84
    const-string v3, "error_code"

    .line 85
    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v3, v4, v1, v2}, La/b1j;->w(Ljava/lang/String;Ljava/lang/Integer;La/kt2;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, La/u0v0;->t:La/je;

    .line 94
    .line 95
    iget-object v1, v1, La/je;->a:La/s1p;

    .line 96
    .line 97
    const-wide/16 v2, 0xcd0

    .line 98
    .line 99
    invoke-static {v0, v1, v2, v3}, La/b1j;->r(ILa/s1p;J)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, v1, La/zg;->a:La/kt2;

    .line 104
    .line 105
    invoke-interface {v0, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    invoke-virtual {p0, p1}, La/u0v0;->M(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
