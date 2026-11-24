.class public final synthetic La/sic0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vic0;


# direct methods
.method public synthetic constructor <init>(La/vic0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sic0;->a:B

    iput-object p1, p0, La/sic0;->b:La/vic0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sic0;->a:B

    .line 2
    .line 3
    sget-object v1, La/d16;->a:La/d16;

    .line 4
    .line 5
    iget-object p0, p0, La/sic0;->b:La/vic0;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/vic0;->H0()La/hjc0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, La/hjc0;->x()V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/vic0;->H0()La/hjc0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p1, p0, La/hjc0;->f:La/m1e;

    .line 37
    .line 38
    invoke-interface {p1}, La/m1e;->c()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, v1}, La/hjc0;->w(La/i16;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p0, La/hjc0;->k:La/p7m0;

    .line 49
    .line 50
    new-instance v0, La/cjc0;

    .line 51
    .line 52
    iget-object v1, p0, La/hjc0;->e:La/s470;

    .line 53
    .line 54
    invoke-direct {v0, v1}, La/cjc0;-><init>(La/s470;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/hjc0;->x()V

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/vic0;->H0()La/hjc0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p1, p0, La/hjc0;->f:La/m1e;

    .line 80
    .line 81
    invoke-interface {p1}, La/m1e;->c()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p0, v1}, La/hjc0;->w(La/i16;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    iget-object p1, p0, La/hjc0;->e:La/s470;

    .line 92
    .line 93
    sget-object v0, La/s470;->f:La/s470;

    .line 94
    .line 95
    if-ne p1, v0, :cond_2

    .line 96
    .line 97
    new-instance p1, La/f16;

    .line 98
    .line 99
    const/4 v0, 0x1

    .line 100
    invoke-direct {p1, v0}, La/f16;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/hjc0;->w(La/i16;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    new-instance p1, La/f16;

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-direct {p1, v0}, La/f16;-><init>(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, La/hjc0;->w(La/i16;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
