.class public final Lorg/xplatform/betting/core/zip/model/zip/BetZip;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lorg/xplatform/betting/core/zip/model/zip/BetZip;",
        "Landroid/os/Parcelable;",
        "a/y860",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/xplatform/betting/core/zip/model/zip/BetZip;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Z

.field public final Y:Z

.field public final Z:Ljava/lang/String;

.field public final a:J

.field public final b:D

.field public final c:J

.field public final d:D

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final f1:Z

.field public final g:Ljava/lang/String;

.field public final g1:Z

.field public final h:Ljava/lang/String;

.field public final h1:Z

.field public final i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

.field public final i1:Lorg/xplatform/betting/core/zip/model/zip/EventParams;

.field public final j:I

.field public final k:J

.field public final l:La/uoy;

.field public final m:J

.field public final n:I

.field public final o:J

.field public final p:Z

.field public final q:J

.field public final r:Z

.field public final s:Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:La/izc;

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/qo7;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/qo7;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(JDJDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;IJLa/uoy;JIJZJZLorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;Ljava/lang/String;Ljava/lang/String;La/izc;ZZZZLjava/lang/String;ZZLjava/lang/String;ZZZLorg/xplatform/betting/core/zip/model/zip/EventParams;)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p27 .. p27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p28 .. p28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p29 .. p29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p30 .. p30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p35 .. p35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p38 .. p38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {p42 .. p42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-wide p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 41
    .line 42
    iput-wide p3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 43
    .line 44
    iput-wide p5, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 45
    .line 46
    iput-wide p7, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 47
    .line 48
    iput-object p9, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->e:Ljava/lang/String;

    .line 49
    .line 50
    iput-boolean p10, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 51
    .line 52
    iput-object p11, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p12, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p13, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 57
    .line 58
    iput p14, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->j:I

    .line 59
    .line 60
    move-wide p1, p15

    .line 61
    iput-wide p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->k:J

    .line 62
    .line 63
    move-object/from16 p1, p17

    .line 64
    .line 65
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->l:La/uoy;

    .line 66
    .line 67
    move-wide/from16 p1, p18

    .line 68
    .line 69
    iput-wide p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->m:J

    .line 70
    .line 71
    move/from16 p1, p20

    .line 72
    .line 73
    iput p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->n:I

    .line 74
    .line 75
    move-wide/from16 p1, p21

    .line 76
    .line 77
    iput-wide p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->o:J

    .line 78
    .line 79
    move/from16 p1, p23

    .line 80
    .line 81
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->p:Z

    .line 82
    .line 83
    move-wide/from16 p1, p24

    .line 84
    .line 85
    iput-wide p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->q:J

    .line 86
    .line 87
    move/from16 p1, p26

    .line 88
    .line 89
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->r:Z

    .line 90
    .line 91
    move-object/from16 p1, p27

    .line 92
    .line 93
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->s:Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    .line 94
    .line 95
    move-object/from16 p1, p28

    .line 96
    .line 97
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 98
    .line 99
    move-object/from16 p1, p29

    .line 100
    .line 101
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->u:Ljava/lang/String;

    .line 102
    .line 103
    move-object/from16 p1, p30

    .line 104
    .line 105
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 106
    .line 107
    move/from16 p1, p31

    .line 108
    .line 109
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    .line 110
    .line 111
    move/from16 p1, p32

    .line 112
    .line 113
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->x:Z

    .line 114
    .line 115
    move/from16 p1, p33

    .line 116
    .line 117
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 118
    .line 119
    move/from16 p1, p34

    .line 120
    .line 121
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->z:Z

    .line 122
    .line 123
    move-object/from16 p1, p35

    .line 124
    .line 125
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->A:Ljava/lang/String;

    .line 126
    .line 127
    move/from16 p1, p36

    .line 128
    .line 129
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->B:Z

    .line 130
    .line 131
    move/from16 p1, p37

    .line 132
    .line 133
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Y:Z

    .line 134
    .line 135
    move-object/from16 p1, p38

    .line 136
    .line 137
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Z:Ljava/lang/String;

    .line 138
    .line 139
    move/from16 p1, p39

    .line 140
    .line 141
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f1:Z

    .line 142
    .line 143
    move/from16 p1, p40

    .line 144
    .line 145
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g1:Z

    .line 146
    .line 147
    move/from16 p1, p41

    .line 148
    .line 149
    iput-boolean p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h1:Z

    .line 150
    .line 151
    move-object/from16 p1, p42

    .line 152
    .line 153
    iput-object p1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i1:Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 154
    .line 155
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 27
    .line 28
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 29
    .line 30
    iget-wide v5, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 31
    .line 32
    cmp-long v1, v3, v5

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 38
    .line 39
    iget-wide v5, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 40
    .line 41
    cmp-long v1, v3, v5

    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 47
    .line 48
    iget-wide v5, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 49
    .line 50
    cmpg-double v1, v3, v5

    .line 51
    .line 52
    if-nez v1, :cond_c

    .line 53
    .line 54
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 55
    .line 56
    iget-object v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 57
    .line 58
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    return v2

    .line 65
    :cond_5
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 66
    .line 67
    iget-wide v5, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 68
    .line 69
    cmpg-double v1, v3, v5

    .line 70
    .line 71
    if-nez v1, :cond_c

    .line 72
    .line 73
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_6

    .line 82
    .line 83
    return v2

    .line 84
    :cond_6
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_7

    .line 93
    .line 94
    return v2

    .line 95
    :cond_7
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 96
    .line 97
    iget-object v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 98
    .line 99
    if-eq v1, v3, :cond_8

    .line 100
    .line 101
    return v2

    .line 102
    :cond_8
    iget-boolean v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    .line 103
    .line 104
    iget-boolean v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    .line 105
    .line 106
    if-eq v1, v3, :cond_9

    .line 107
    .line 108
    return v2

    .line 109
    :cond_9
    iget-boolean v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 110
    .line 111
    iget-boolean v3, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 112
    .line 113
    if-eq v1, v3, :cond_a

    .line 114
    .line 115
    return v2

    .line 116
    :cond_a
    iget-boolean p0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 117
    .line 118
    iget-boolean p1, p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 119
    .line 120
    if-eq p0, p1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    return v0

    .line 124
    :cond_c
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    const/16 v1, 0x1f

    .line 5
    .line 6
    mul-int/2addr v0, v1

    .line 7
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    add-int/2addr v0, v2

    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 19
    .line 20
    double-to-int v2, v2

    .line 21
    add-int/2addr v0, v2

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    mul-int/2addr v2, v1

    .line 37
    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 38
    .line 39
    invoke-virtual {v0}, Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    add-int/2addr v0, v2

    .line 44
    mul-int/2addr v0, v1

    .line 45
    iget-boolean v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    move v2, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v2, 0x0

    .line 52
    :goto_0
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-boolean p0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BetZip(id="

    .line 2
    .line 3
    const-string v1, ", coef="

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", groupId="

    .line 17
    .line 18
    const-string v2, ", param="

    .line 19
    .line 20
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", paramStr="

    .line 26
    .line 27
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 28
    .line 29
    iget-object v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v2, v3, v1, v4}, La/hne;->w(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", blocked="

    .line 35
    .line 36
    const-string v2, ", coefV="

    .line 37
    .line 38
    iget-object v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 41
    .line 42
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 43
    .line 44
    .line 45
    const-string v1, ", marketName="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", player="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", eventId="

    .line 66
    .line 67
    const-string v2, ", marketId="

    .line 68
    .line 69
    iget v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->j:I

    .line 70
    .line 71
    invoke-static {v0, v1, v3, v2}, La/rw2;->x(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-wide v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->k:J

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", kind="

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->l:La/uoy;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v1, ", gameId="

    .line 90
    .line 91
    const-string v2, ", relation="

    .line 92
    .line 93
    iget-wide v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->m:J

    .line 94
    .line 95
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->n:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", playerId="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-wide v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->o:J

    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", gameFinished="

    .line 114
    .line 115
    const-string v2, ", subSportId="

    .line 116
    .line 117
    iget-boolean v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->p:Z

    .line 118
    .line 119
    invoke-static {v0, v1, v3, v2}, La/rz4;->A(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v1, ", bannedExpress="

    .line 123
    .line 124
    iget-wide v2, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->q:J

    .line 125
    .line 126
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->r:Z

    .line 127
    .line 128
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 129
    .line 130
    .line 131
    const-string v1, ", playersDuelZip="

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->s:Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, ", name="

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v1, ", groupName="

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->u:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, ", coefState="

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    iget-object v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", isTracked="

    .line 172
    .line 173
    const-string v2, ", startingPrice="

    .line 174
    .line 175
    iget-boolean v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    .line 176
    .line 177
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->x:Z

    .line 178
    .line 179
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 180
    .line 181
    .line 182
    const-string v1, ", addedToCoupon="

    .line 183
    .line 184
    const-string v2, ", isEmptyCoef="

    .line 185
    .line 186
    iget-boolean v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 187
    .line 188
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->z:Z

    .line 189
    .line 190
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 191
    .line 192
    .line 193
    const-string v1, ", playerName="

    .line 194
    .line 195
    const-string v2, ", isRelation="

    .line 196
    .line 197
    iget-object v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->A:Ljava/lang/String;

    .line 198
    .line 199
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->B:Z

    .line 200
    .line 201
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 202
    .line 203
    .line 204
    const-string v1, ", notValid="

    .line 205
    .line 206
    const-string v2, ", paramName="

    .line 207
    .line 208
    iget-object v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Z:Ljava/lang/String;

    .line 209
    .line 210
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Y:Z

    .line 211
    .line 212
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 213
    .line 214
    .line 215
    const-string v1, ", isCanBet="

    .line 216
    .line 217
    const-string v2, ", center="

    .line 218
    .line 219
    iget-boolean v3, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f1:Z

    .line 220
    .line 221
    iget-boolean v4, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g1:Z

    .line 222
    .line 223
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 224
    .line 225
    .line 226
    const-string v1, ", specialSign="

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-boolean v1, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h1:Z

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v1, ", eventParams="

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    iget-object p0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i1:Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 242
    .line 243
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string p0, ")"

    .line 247
    .line 248
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i:Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    invoke-virtual {v0, p1, p2}, Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->j:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->k:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->l:La/uoy;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->m:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->o:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->p:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->q:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->r:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->s:Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    invoke-virtual {v0, p1, p2}, Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->x:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->A:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->B:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Y:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->Z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f1:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g1:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->h1:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->i1:Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    invoke-virtual {p0, p1, p2}, Lorg/xplatform/betting/core/zip/model/zip/EventParams;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
