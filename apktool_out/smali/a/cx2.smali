.class public final synthetic La/cx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mie0;


# direct methods
.method public synthetic constructor <init>(La/mie0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cx2;->a:B

    iput-object p1, p0, La/cx2;->b:La/mie0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/cx2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/cx2;->b:La/mie0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/mcy;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, La/hps0;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p1, La/jps0;

    .line 26
    .line 27
    iget-object p1, p1, La/jps0;->o:La/tbz;

    .line 28
    .line 29
    iget-object v0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    filled-new-array {p1}, [La/tbz;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    iput-object v0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    sget-object p0, La/gps0;->b:La/gps0;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, La/hps0;

    .line 53
    .line 54
    move-object v0, p1

    .line 55
    check-cast v0, La/lm40;

    .line 56
    .line 57
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 58
    .line 59
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    move v1, v2

    .line 66
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_2
    check-cast p1, La/qsw;

    .line 72
    .line 73
    iget-object v0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    iget-boolean v1, p1, La/qsw;->q:Z

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_3
    check-cast p1, Ljava/lang/Exception;

    .line 93
    .line 94
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_4
    check-cast p1, Ljava/lang/Exception;

    .line 100
    .line 101
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 107
    .line 108
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 114
    .line 115
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_7
    check-cast p1, La/zlt;

    .line 121
    .line 122
    invoke-interface {p1}, La/zlt;->F()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v3, "waiting"

    .line 127
    .line 128
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 135
    .line 136
    move v1, v2

    .line 137
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_8
    check-cast p1, La/nqq;

    .line 143
    .line 144
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 145
    .line 146
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 147
    .line 148
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
