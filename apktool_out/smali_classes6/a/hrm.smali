.class public final La/hrm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Z


# direct methods
.method public constructor <init>(FLa/et8;ZLa/vne;F)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/hrm;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/hrm;->d:F

    .line 8
    .line 9
    iput-object p2, p0, La/hrm;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, La/hrm;->f:Z

    .line 12
    .line 13
    iput-object p4, p0, La/hrm;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iput p5, p0, La/hrm;->e:F

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/prm;FFZB)V
    .locals 0

    .line 18
    iput-byte p6, p0, La/hrm;->a:B

    iput-object p1, p0, La/hrm;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hrm;->c:Ljava/lang/Object;

    iput p3, p0, La/hrm;->d:F

    iput p4, p0, La/hrm;->e:F

    iput-boolean p5, p0, La/hrm;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/hrm;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hrm;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/hrm;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/et8;

    .line 11
    .line 12
    new-instance v6, La/d38;

    .line 13
    .line 14
    const/16 v0, 0xc

    .line 15
    .line 16
    invoke-direct {v6, v2, v0}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    check-cast v1, La/vne;

    .line 20
    .line 21
    new-instance v9, La/igm;

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-boolean v3, p0, La/hrm;->f:Z

    .line 25
    .line 26
    invoke-direct {v9, v2, v3, v1, v0}, La/igm;-><init>(Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v8, La/xs8;

    .line 30
    .line 31
    iget v0, p0, La/hrm;->e:F

    .line 32
    .line 33
    invoke-direct {v8, v2, v1, v3, v0}, La/xs8;-><init>(La/et8;La/vne;ZF)V

    .line 34
    .line 35
    .line 36
    new-instance v4, La/vb8;

    .line 37
    .line 38
    invoke-direct {v4, v2, v3}, La/vb8;-><init>(La/et8;Z)V

    .line 39
    .line 40
    .line 41
    new-instance v7, La/j6u0;

    .line 42
    .line 43
    invoke-direct {v7}, La/j6u0;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v3, La/at8;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    iget v5, p0, La/hrm;->d:F

    .line 50
    .line 51
    invoke-direct/range {v3 .. v10}, La/at8;-><init>(La/vb8;FLa/d38;La/j6u0;La/xs8;La/igm;La/yje;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v3, p2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object p1, La/wne;->a:La/wne;

    .line 59
    .line 60
    if-ne p0, p1, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_0
    if-ne p0, p1, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_1
    return-object p0

    .line 71
    :pswitch_0
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    check-cast v1, La/prm;

    .line 74
    .line 75
    new-instance v0, La/m4m;

    .line 76
    .line 77
    iget v3, p0, La/hrm;->d:F

    .line 78
    .line 79
    iget v4, p0, La/hrm;->e:F

    .line 80
    .line 81
    iget-boolean v5, p0, La/hrm;->f:Z

    .line 82
    .line 83
    move-object v11, v2

    .line 84
    move-object v2, v1

    .line 85
    move-object v1, v11

    .line 86
    invoke-direct/range {v0 .. v5}, La/m4m;-><init>(Lkotlin/jvm/functions/Function1;La/prm;FFZ)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x7

    .line 90
    invoke-static {p1, v0, p2, p0}, La/tto0;->d(La/hpa0;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object p1, La/wne;->a:La/wne;

    .line 95
    .line 96
    if-ne p0, p1, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_2
    return-object p0

    .line 102
    :pswitch_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 103
    .line 104
    check-cast v1, La/prm;

    .line 105
    .line 106
    new-instance v0, La/w5m;

    .line 107
    .line 108
    iget v3, p0, La/hrm;->d:F

    .line 109
    .line 110
    iget v4, p0, La/hrm;->e:F

    .line 111
    .line 112
    iget-boolean v5, p0, La/hrm;->f:Z

    .line 113
    .line 114
    move-object v11, v2

    .line 115
    move-object v2, v1

    .line 116
    move-object v1, v11

    .line 117
    invoke-direct/range {v0 .. v5}, La/w5m;-><init>(Lkotlin/jvm/functions/Function1;La/prm;FFZ)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0, p2}, La/bel;->f(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    sget-object p1, La/wne;->a:La/wne;

    .line 125
    .line 126
    if-ne p0, p1, :cond_3

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_3
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
