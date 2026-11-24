.class public final La/y0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:La/agk0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/cgk0;La/agk0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/y0z;->a:B

    iput-object p1, p0, La/y0z;->b:La/l7m0;

    iput-object p2, p0, La/y0z;->c:La/cgk0;

    iput-object p3, p0, La/y0z;->d:La/agk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/y0z;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/y0z;->d:La/agk0;

    .line 4
    .line 5
    iget-object v2, p0, La/y0z;->c:La/cgk0;

    .line 6
    .line 7
    iget-object p0, p0, La/y0z;->b:La/l7m0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/uag0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1, v0}, La/uag0;->g(Z)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    new-instance p0, La/mge0;

    .line 43
    .line 44
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    invoke-virtual {v1}, La/agk0;->l()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    sub-float/2addr v0, v1

    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p0, v0, v1}, La/mge0;-><init>(FB)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object p0, La/jd8;->n:La/ljc;

    .line 60
    .line 61
    :goto_0
    invoke-virtual {p1, p0}, La/uag0;->D(La/yjj0;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    check-cast p1, La/uag0;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p1, v0}, La/uag0;->g(Z)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_1

    .line 96
    .line 97
    new-instance p0, La/mge0;

    .line 98
    .line 99
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-float v0, v0

    .line 104
    invoke-virtual {v1}, La/agk0;->l()F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    sub-float/2addr v0, v1

    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-direct {p0, v0, v1}, La/mge0;-><init>(FB)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    sget-object p0, La/jd8;->n:La/ljc;

    .line 115
    .line 116
    :goto_1
    invoke-virtual {p1, p0}, La/uag0;->D(La/yjj0;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
