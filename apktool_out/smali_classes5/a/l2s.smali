.class public final synthetic La/l2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o2s;


# direct methods
.method public synthetic constructor <init>(La/o2s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l2s;->a:B

    iput-object p1, p0, La/l2s;->b:La/o2s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/l2s;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l2s;->b:La/o2s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/o2s;->g:La/pz40;

    .line 14
    .line 15
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/t33;

    .line 22
    .line 23
    iget-object v0, p1, La/t33;->e:La/pz40;

    .line 24
    .line 25
    check-cast v0, La/hgk0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    cmpg-float p1, v0, p1

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, La/o2s;->e:La/agk0;

    .line 52
    .line 53
    iget v0, p0, La/o2s;->j:F

    .line 54
    .line 55
    iget-object v1, p0, La/o2s;->i:La/agk0;

    .line 56
    .line 57
    iget-object p0, p0, La/o2s;->f:La/pz40;

    .line 58
    .line 59
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/eah0;

    .line 64
    .line 65
    if-nez p0, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1}, La/agk0;->l()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    :goto_0
    sub-float/2addr p0, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    instance-of v2, p0, La/y9h0;

    .line 74
    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    instance-of p0, p0, La/bah0;

    .line 80
    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1}, La/agk0;->l()F

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    goto :goto_0

    .line 88
    :goto_1
    invoke-virtual {p1, p0}, La/agk0;->m(F)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_3
    return-object p0

    .line 100
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/o2s;->h:La/pz40;

    .line 106
    .line 107
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
