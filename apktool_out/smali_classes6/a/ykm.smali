.class public final synthetic La/ykm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/oa50;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/oa50;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ykm;->a:B

    iput-object p1, p0, La/ykm;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ykm;->c:La/oa50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ykm;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ykm;->c:La/oa50;

    .line 4
    .line 5
    iget-object p0, p0, La/ykm;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast v1, La/la50;

    .line 13
    .line 14
    iget-object v0, v1, La/la50;->a:La/skm;

    .line 15
    .line 16
    iget-byte v0, v0, La/skm;->a:B

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    if-eqz p0, :cond_1

    .line 29
    .line 30
    check-cast v1, La/ma50;

    .line 31
    .line 32
    iget-object v0, v1, La/ma50;->c:La/skm;

    .line 33
    .line 34
    iget-byte v0, v0, La/skm;->a:B

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    if-eqz p0, :cond_2

    .line 47
    .line 48
    check-cast v1, La/ma50;

    .line 49
    .line 50
    iget-object v0, v1, La/ma50;->b:La/skm;

    .line 51
    .line 52
    iget-byte v0, v0, La/skm;->a:B

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_2
    if-eqz p0, :cond_3

    .line 65
    .line 66
    check-cast v1, La/ma50;

    .line 67
    .line 68
    iget-object v0, v1, La/ma50;->a:La/skm;

    .line 69
    .line 70
    iget-byte v0, v0, La/skm;->a:B

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_3
    if-eqz p0, :cond_4

    .line 83
    .line 84
    check-cast v1, La/na50;

    .line 85
    .line 86
    iget-object v0, v1, La/na50;->b:La/skm;

    .line 87
    .line 88
    iget-byte v0, v0, La/skm;->a:B

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_4
    if-eqz p0, :cond_5

    .line 101
    .line 102
    check-cast v1, La/na50;

    .line 103
    .line 104
    iget-object v0, v1, La/na50;->a:La/skm;

    .line 105
    .line 106
    iget-byte v0, v0, La/skm;->a:B

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
