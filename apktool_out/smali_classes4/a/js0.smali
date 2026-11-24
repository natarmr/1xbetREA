.class public final La/js0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:J

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(JJJZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    invoke-static/range {p10 .. p12}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    sget-object v0, La/v2s0;->a:[La/v2s0;

    move-object v1, p0

    move-wide v2, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    move-object/from16 v5, p10

    move-object/from16 v4, p11

    move-object/from16 v6, p12

    .line 29
    invoke-direct/range {v1 .. v13}, La/js0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 1

    .line 1
    sget-object v0, La/v2s0;->a:[La/v2s0;

    .line 2
    .line 3
    invoke-static {p3, p4, p5}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, La/js0;->a:J

    .line 10
    .line 11
    iput-object p3, p0, La/js0;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/js0;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/js0;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p6, p0, La/js0;->e:J

    .line 18
    .line 19
    iput-wide p8, p0, La/js0;->f:J

    .line 20
    .line 21
    iput-boolean p10, p0, La/js0;->g:Z

    .line 22
    .line 23
    iput-boolean p11, p0, La/js0;->h:Z

    .line 24
    .line 25
    iput-boolean p12, p0, La/js0;->i:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, La/js0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/js0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-wide v1, p1, La/js0;->a:J

    .line 13
    .line 14
    iget-wide p0, p0, La/js0;->a:J

    .line 15
    .line 16
    cmp-long p0, v1, p0

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, La/js0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
