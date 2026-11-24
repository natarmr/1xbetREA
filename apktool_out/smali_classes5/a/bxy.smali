.class public final La/bxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ek00;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/ek00;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bxy;->a:B

    iput-object p1, p0, La/bxy;->b:La/ek00;

    iput-object p2, p0, La/bxy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bxy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bxy;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/bxy;->b:La/ek00;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v2, p0, La/ek00;->a:J

    .line 15
    .line 16
    new-instance p0, La/tc2;

    .line 17
    .line 18
    invoke-direct {p0, v2, v3}, La/tc2;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-wide v2, p0, La/ek00;->a:J

    .line 32
    .line 33
    new-instance p0, La/oc2;

    .line 34
    .line 35
    invoke-direct {p0, v2, v3}, La/oc2;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-wide v2, p0, La/ek00;->a:J

    .line 49
    .line 50
    new-instance p0, La/tc2;

    .line 51
    .line 52
    invoke-direct {p0, v2, v3}, La/tc2;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-wide v2, p0, La/ek00;->a:J

    .line 66
    .line 67
    new-instance p0, La/oc2;

    .line 68
    .line 69
    invoke-direct {p0, v2, v3}, La/oc2;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-wide v2, p0, La/ek00;->a:J

    .line 83
    .line 84
    new-instance p0, La/tc2;

    .line 85
    .line 86
    invoke-direct {p0, v2, v3}, La/tc2;-><init>(J)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_4
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    iget-wide v2, p0, La/ek00;->a:J

    .line 100
    .line 101
    new-instance p0, La/oc2;

    .line 102
    .line 103
    invoke-direct {p0, v2, v3}, La/oc2;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_5
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    iget-wide v2, p0, La/ek00;->a:J

    .line 117
    .line 118
    new-instance p0, La/tc2;

    .line 119
    .line 120
    invoke-direct {p0, v2, v3}, La/tc2;-><init>(J)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_6
    iget-boolean v0, p0, La/ek00;->d:Z

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iget-wide v2, p0, La/ek00;->a:J

    .line 134
    .line 135
    new-instance p0, La/oc2;

    .line 136
    .line 137
    invoke-direct {p0, v2, v3}, La/oc2;-><init>(J)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
