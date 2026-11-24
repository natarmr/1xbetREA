.class public final synthetic La/nh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/on20;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:D

.field public final synthetic d:Z

.field public final synthetic e:La/d680;


# direct methods
.method public synthetic constructor <init>(La/on20;Ljava/lang/String;DZLa/d680;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nh20;->a:La/on20;

    iput-object p2, p0, La/nh20;->b:Ljava/lang/String;

    iput-wide p3, p0, La/nh20;->c:D

    iput-boolean p5, p0, La/nh20;->d:Z

    iput-object p6, p0, La/nh20;->e:La/d680;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

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
    iget-object v3, v2, La/a820;->b:La/txe;

    .line 18
    .line 19
    new-instance v11, La/h680;

    .line 20
    .line 21
    iget-object v1, v3, La/txe;->g:La/h680;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v4, v1, La/h680;->a:La/m0d;

    .line 26
    .line 27
    move-object v5, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v12, La/m0d;

    .line 30
    .line 31
    sget-object v19, La/azc;->a:La/azc;

    .line 32
    .line 33
    sget-object v21, La/o0d;->a:La/o0d;

    .line 34
    .line 35
    const-wide/16 v13, 0x0

    .line 36
    .line 37
    const-string v15, ""

    .line 38
    .line 39
    const-wide/16 v16, 0x0

    .line 40
    .line 41
    const-string v18, ""

    .line 42
    .line 43
    move-object/from16 v20, v19

    .line 44
    .line 45
    invoke-direct/range {v12 .. v21}, La/m0d;-><init>(DLjava/lang/String;DLjava/lang/String;La/azc;La/azc;La/o0d;)V

    .line 46
    .line 47
    .line 48
    move-object v5, v12

    .line 49
    :goto_0
    const/4 v9, 0x1

    .line 50
    iget-object v4, v0, La/nh20;->a:La/on20;

    .line 51
    .line 52
    iget-object v6, v0, La/nh20;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v7, v0, La/nh20;->c:D

    .line 55
    .line 56
    iget-boolean v10, v0, La/nh20;->d:Z

    .line 57
    .line 58
    invoke-virtual/range {v4 .. v10}, La/on20;->K0(La/m0d;Ljava/lang/String;DZZ)La/m0d;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    move/from16 v18, v10

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object v1, v1, La/h680;->b:La/m0d;

    .line 67
    .line 68
    move-object v13, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance v19, La/m0d;

    .line 71
    .line 72
    sget-object v26, La/azc;->a:La/azc;

    .line 73
    .line 74
    sget-object v28, La/o0d;->a:La/o0d;

    .line 75
    .line 76
    const-wide/16 v20, 0x0

    .line 77
    .line 78
    const-string v22, ""

    .line 79
    .line 80
    const-wide/16 v23, 0x0

    .line 81
    .line 82
    const-string v25, ""

    .line 83
    .line 84
    move-object/from16 v27, v26

    .line 85
    .line 86
    invoke-direct/range {v19 .. v28}, La/m0d;-><init>(DLjava/lang/String;DLjava/lang/String;La/azc;La/azc;La/o0d;)V

    .line 87
    .line 88
    .line 89
    move-object/from16 v13, v19

    .line 90
    .line 91
    :goto_1
    iget-object v0, v0, La/nh20;->e:La/d680;

    .line 92
    .line 93
    iget-object v14, v0, La/d680;->b:Ljava/lang/String;

    .line 94
    .line 95
    iget-wide v0, v0, La/d680;->a:D

    .line 96
    .line 97
    const/16 v17, 0x1

    .line 98
    .line 99
    move-wide v15, v0

    .line 100
    move-object v12, v4

    .line 101
    invoke-virtual/range {v12 .. v18}, La/on20;->K0(La/m0d;Ljava/lang/String;DZZ)La/m0d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v11, v5, v0}, La/h680;-><init>(La/m0d;La/m0d;)V

    .line 106
    .line 107
    .line 108
    const/16 v12, 0x3f

    .line 109
    .line 110
    const-wide/16 v4, 0x0

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    invoke-static/range {v3 .. v12}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const v19, 0x3fffd

    .line 124
    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0
.end method
