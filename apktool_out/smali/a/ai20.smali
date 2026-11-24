.class public final synthetic La/ai20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/ai20;->a:Z

    iput-boolean p2, p0, La/ai20;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/a820;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, La/a820;->e:La/pvj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iget-boolean v4, v0, La/ai20;->a:Z

    .line 21
    .line 22
    iget-boolean v0, v0, La/ai20;->b:Z

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v4, v1

    .line 31
    :goto_0
    iget-object v5, v3, La/pvj0;->a:La/bx6;

    .line 32
    .line 33
    move-object v6, v5

    .line 34
    iget-object v5, v6, La/bx6;->b:La/tw6;

    .line 35
    .line 36
    const/16 v25, 0x0

    .line 37
    .line 38
    const v26, 0xfbff

    .line 39
    .line 40
    .line 41
    move-object v8, v6

    .line 42
    const-wide/16 v6, 0x0

    .line 43
    .line 44
    move-object v10, v8

    .line 45
    const-wide/16 v8, 0x0

    .line 46
    .line 47
    move-object v12, v10

    .line 48
    const-wide/16 v10, 0x0

    .line 49
    .line 50
    move-object v14, v12

    .line 51
    const-wide/16 v12, 0x0

    .line 52
    .line 53
    move-object/from16 v16, v14

    .line 54
    .line 55
    const-wide/16 v14, 0x0

    .line 56
    .line 57
    move-object/from16 v17, v16

    .line 58
    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    move-object/from16 v18, v17

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    move-object/from16 v19, v18

    .line 66
    .line 67
    const/16 v18, 0x0

    .line 68
    .line 69
    move-object/from16 v20, v19

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    move-object/from16 v21, v20

    .line 74
    .line 75
    const/16 v20, 0x0

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    move-object/from16 v27, v21

    .line 84
    .line 85
    move/from16 v21, v0

    .line 86
    .line 87
    move-object/from16 v0, v27

    .line 88
    .line 89
    invoke-static/range {v5 .. v26}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const/4 v6, 0x5

    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-static {v0, v7, v5, v1, v6}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v8, 0x0

    .line 100
    const/16 v10, 0x1e

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    move v9, v4

    .line 105
    move-object v4, v0

    .line 106
    invoke-static/range {v3 .. v10}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const v19, 0x3ffef

    .line 111
    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    const/4 v13, 0x0

    .line 120
    const/4 v14, 0x0

    .line 121
    const/4 v15, 0x0

    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0
.end method
