.class public final La/fj30;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/ej30;

.field public static final n:[La/a8z;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:D

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Ljava/util/List;

.field public final m:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ej30;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fj30;->Companion:La/ej30;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/n230;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/n230;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/n230;

    .line 22
    .line 23
    const/16 v3, 0x1d

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/n230;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v2, 0xd

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
    aput-object v1, v2, v3

    .line 76
    .line 77
    const/16 v1, 0xc

    .line 78
    .line 79
    aput-object v0, v2, v1

    .line 80
    .line 81
    sput-object v2, La/fj30;->n:[La/a8z;

    .line 82
    .line 83
    return-void
.end method

.method public synthetic constructor <init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DIIILjava/lang/String;JLjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0x1fff

    .line 2
    .line 3
    const/16 v1, 0x1fff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/fj30;->a:J

    .line 11
    .line 12
    iput-wide p4, p0, La/fj30;->b:J

    .line 13
    .line 14
    iput-object p6, p0, La/fj30;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, La/fj30;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, La/fj30;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-wide p9, p0, La/fj30;->f:D

    .line 21
    .line 22
    iput p11, p0, La/fj30;->g:I

    .line 23
    .line 24
    iput p12, p0, La/fj30;->h:I

    .line 25
    .line 26
    iput p13, p0, La/fj30;->i:I

    .line 27
    .line 28
    move-object/from16 p1, p14

    .line 29
    .line 30
    iput-object p1, p0, La/fj30;->j:Ljava/lang/String;

    .line 31
    .line 32
    move-wide/from16 p1, p15

    .line 33
    .line 34
    iput-wide p1, p0, La/fj30;->k:J

    .line 35
    .line 36
    move-object/from16 p1, p17

    .line 37
    .line 38
    iput-object p1, p0, La/fj30;->l:Ljava/util/List;

    .line 39
    .line 40
    move-object/from16 p1, p18

    .line 41
    .line 42
    iput-object p1, p0, La/fj30;->m:Ljava/util/List;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    sget-object p0, La/dj30;->a:La/dj30;

    .line 46
    .line 47
    invoke-virtual {p0}, La/dj30;->getDescriptor()La/ugi0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    throw p0
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;DILjava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-wide p1, p0, La/fj30;->a:J

    .line 58
    iput-wide p3, p0, La/fj30;->b:J

    .line 59
    iput-object p5, p0, La/fj30;->c:Ljava/lang/String;

    .line 60
    iput-object p6, p0, La/fj30;->d:Ljava/lang/String;

    .line 61
    const-string p1, "0"

    iput-object p1, p0, La/fj30;->e:Ljava/lang/String;

    .line 62
    iput-wide p7, p0, La/fj30;->f:D

    const/16 p1, 0x16

    .line 63
    iput p1, p0, La/fj30;->g:I

    const/4 p1, 0x1

    .line 64
    iput p1, p0, La/fj30;->h:I

    .line 65
    iput p9, p0, La/fj30;->i:I

    .line 66
    iput-object p10, p0, La/fj30;->j:Ljava/lang/String;

    .line 67
    iput-wide p11, p0, La/fj30;->k:J

    .line 68
    iput-object p13, p0, La/fj30;->l:Ljava/util/List;

    .line 69
    iput-object p14, p0, La/fj30;->m:Ljava/util/List;

    return-void
.end method
