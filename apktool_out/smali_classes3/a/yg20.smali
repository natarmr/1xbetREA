.class public final La/yg20;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/xg20;

.field public static final r:[La/a8z;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:D

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Ljava/lang/String;

.field public final m:J

.field public final n:Z

.field public final o:Ljava/util/List;

.field public final p:Ljava/util/List;

.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/xg20;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/yg20;->Companion:La/xg20;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/sv10;

    .line 11
    .line 12
    const/16 v2, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/sv10;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/sv10;

    .line 22
    .line 23
    const/16 v3, 0x13

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/sv10;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v2, 0x11

    .line 33
    .line 34
    new-array v2, v2, [La/a8z;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    aput-object v4, v2, v3

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    aput-object v4, v2, v3

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    aput-object v4, v2, v3

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    aput-object v4, v2, v3

    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    aput-object v4, v2, v3

    .line 51
    .line 52
    const/4 v3, 0x5

    .line 53
    aput-object v4, v2, v3

    .line 54
    .line 55
    const/4 v3, 0x6

    .line 56
    aput-object v4, v2, v3

    .line 57
    .line 58
    const/4 v3, 0x7

    .line 59
    aput-object v4, v2, v3

    .line 60
    .line 61
    const/16 v3, 0x8

    .line 62
    .line 63
    aput-object v4, v2, v3

    .line 64
    .line 65
    const/16 v3, 0x9

    .line 66
    .line 67
    aput-object v4, v2, v3

    .line 68
    .line 69
    const/16 v3, 0xa

    .line 70
    .line 71
    aput-object v4, v2, v3

    .line 72
    .line 73
    const/16 v3, 0xb

    .line 74
    .line 75
    aput-object v4, v2, v3

    .line 76
    .line 77
    const/16 v3, 0xc

    .line 78
    .line 79
    aput-object v4, v2, v3

    .line 80
    .line 81
    const/16 v3, 0xd

    .line 82
    .line 83
    aput-object v4, v2, v3

    .line 84
    .line 85
    const/16 v3, 0xe

    .line 86
    .line 87
    aput-object v1, v2, v3

    .line 88
    .line 89
    const/16 v1, 0xf

    .line 90
    .line 91
    aput-object v0, v2, v1

    .line 92
    .line 93
    const/16 v0, 0x10

    .line 94
    .line 95
    aput-object v4, v2, v0

    .line 96
    .line 97
    sput-object v2, La/yg20;->r:[La/a8z;

    .line 98
    .line 99
    return-void
.end method

.method public synthetic constructor <init>(IJJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;DIIIILjava/lang/String;JZLjava/util/List;Ljava/util/List;I)V
    .locals 2

    .line 1
    const v0, 0x1dfff

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-wide p2, p0, La/yg20;->a:J

    .line 12
    .line 13
    iput-wide p4, p0, La/yg20;->b:J

    .line 14
    .line 15
    iput-object p6, p0, La/yg20;->c:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p7, p0, La/yg20;->d:Z

    .line 18
    .line 19
    iput-object p8, p0, La/yg20;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p9, p0, La/yg20;->f:Ljava/lang/String;

    .line 22
    .line 23
    iput-wide p10, p0, La/yg20;->g:D

    .line 24
    .line 25
    iput p12, p0, La/yg20;->h:I

    .line 26
    .line 27
    iput p13, p0, La/yg20;->i:I

    .line 28
    .line 29
    move/from16 p2, p14

    .line 30
    .line 31
    iput p2, p0, La/yg20;->j:I

    .line 32
    .line 33
    move/from16 p2, p15

    .line 34
    .line 35
    iput p2, p0, La/yg20;->k:I

    .line 36
    .line 37
    move-object/from16 p2, p16

    .line 38
    .line 39
    iput-object p2, p0, La/yg20;->l:Ljava/lang/String;

    .line 40
    .line 41
    move-wide/from16 p2, p17

    .line 42
    .line 43
    iput-wide p2, p0, La/yg20;->m:J

    .line 44
    .line 45
    and-int/lit16 p1, p1, 0x2000

    .line 46
    .line 47
    if-nez p1, :cond_0

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    :goto_0
    iput-boolean p1, p0, La/yg20;->n:Z

    .line 51
    .line 52
    move-object/from16 p1, p20

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    move/from16 p1, p19

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    iput-object p1, p0, La/yg20;->o:Ljava/util/List;

    .line 59
    .line 60
    move-object/from16 p1, p21

    .line 61
    .line 62
    iput-object p1, p0, La/yg20;->p:Ljava/util/List;

    .line 63
    .line 64
    move/from16 p1, p22

    .line 65
    .line 66
    iput p1, p0, La/yg20;->q:I

    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    sget-object p0, La/wg20;->a:La/wg20;

    .line 70
    .line 71
    invoke-virtual {p0}, La/wg20;->getDescriptor()La/ugi0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p1, v0, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public constructor <init>(JJLjava/lang/String;ZLjava/lang/String;DIILjava/lang/String;JLjava/util/ArrayList;Ljava/util/List;I)V
    .locals 0

    .line 80
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-wide p1, p0, La/yg20;->a:J

    .line 83
    iput-wide p3, p0, La/yg20;->b:J

    .line 84
    iput-object p5, p0, La/yg20;->c:Ljava/lang/String;

    .line 85
    iput-boolean p6, p0, La/yg20;->d:Z

    .line 86
    iput-object p7, p0, La/yg20;->e:Ljava/lang/String;

    .line 87
    const-string p1, "0"

    iput-object p1, p0, La/yg20;->f:Ljava/lang/String;

    .line 88
    iput-wide p8, p0, La/yg20;->g:D

    const/16 p1, 0x16

    .line 89
    iput p1, p0, La/yg20;->h:I

    const/4 p1, 0x1

    .line 90
    iput p1, p0, La/yg20;->i:I

    .line 91
    iput p10, p0, La/yg20;->j:I

    .line 92
    iput p11, p0, La/yg20;->k:I

    .line 93
    iput-object p12, p0, La/yg20;->l:Ljava/lang/String;

    .line 94
    iput-wide p13, p0, La/yg20;->m:J

    .line 95
    iput-boolean p1, p0, La/yg20;->n:Z

    .line 96
    iput-object p15, p0, La/yg20;->o:Ljava/util/List;

    move-object/from16 p1, p16

    .line 97
    iput-object p1, p0, La/yg20;->p:Ljava/util/List;

    move/from16 p1, p17

    .line 98
    iput p1, p0, La/yg20;->q:I

    return-void
.end method
