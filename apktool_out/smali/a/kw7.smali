.class public final synthetic La/kw7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/pu90;ILa/pu90;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/kw7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kw7;->b:La/pu90;

    iput p2, p0, La/kw7;->d:I

    iput-object p3, p0, La/kw7;->c:La/pu90;

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/kw7;->a:B

    iput-object p1, p0, La/kw7;->b:La/pu90;

    iput-object p2, p0, La/kw7;->c:La/pu90;

    iput p3, p0, La/kw7;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/kw7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/kw7;->d:I

    .line 6
    .line 7
    iget-object v4, p0, La/kw7;->c:La/pu90;

    .line 8
    .line 9
    iget-object p0, p0, La/kw7;->b:La/pu90;

    .line 10
    .line 11
    check-cast p1, La/ou90;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 20
    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v4, v2, v3, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget v0, p0, La/pu90;->b:I

    .line 34
    .line 35
    sub-int v0, v3, v0

    .line 36
    .line 37
    div-int/lit8 v0, v0, 0x2

    .line 38
    .line 39
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 40
    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget p0, p0, La/pu90;->a:I

    .line 45
    .line 46
    invoke-interface {p1}, La/w6k;->getDensity()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/high16 v2, 0x40800000    # 4.0f

    .line 51
    .line 52
    mul-float/2addr v0, v2

    .line 53
    float-to-int v0, v0

    .line 54
    add-int/2addr p0, v0

    .line 55
    iget v0, v4, La/pu90;->b:I

    .line 56
    .line 57
    sub-int/2addr v3, v0

    .line 58
    div-int/lit8 v3, v3, 0x2

    .line 59
    .line 60
    invoke-virtual {p1, v4, p0, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 70
    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    iget p0, p0, La/pu90;->b:I

    .line 75
    .line 76
    add-int/2addr p0, v3

    .line 77
    invoke-virtual {p1, v4, v2, p0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 78
    .line 79
    .line 80
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 87
    .line 88
    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    iget p0, p0, La/pu90;->a:I

    .line 92
    .line 93
    add-int/2addr p0, v3

    .line 94
    invoke-virtual {p1, v4, p0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 95
    .line 96
    .line 97
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 104
    .line 105
    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    iget p0, p0, La/pu90;->a:I

    .line 109
    .line 110
    add-int/2addr p0, v3

    .line 111
    invoke-virtual {p1, v4, p0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 112
    .line 113
    .line 114
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
