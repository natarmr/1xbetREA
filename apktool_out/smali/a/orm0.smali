.class public abstract La/orm0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/df60;

.field public b:La/ncs0;

.field public c:La/huo;

.field public d:La/ff60;

.field public e:J

.field public f:J

.field public g:J

.field public h:B

.field public i:I

.field public j:La/fck0;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/df60;

    .line 5
    .line 6
    invoke-direct {v0}, La/df60;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/orm0;->a:La/df60;

    .line 10
    .line 11
    new-instance v0, La/fck0;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, v1, v2}, La/fck0;-><init>(BZ)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/orm0;->j:La/fck0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/orm0;->g:J

    .line 2
    .line 3
    return-void
.end method

.method public b(La/fq80;)J
    .locals 3

    .line 1
    iget-object p0, p1, La/fq80;->a:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-byte v1, p0, v0

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-ne v1, v2, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    aget-byte p0, p0, v1

    .line 11
    .line 12
    and-int/lit16 p0, p0, 0xff

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    shr-int/2addr p0, v1

    .line 16
    const/4 v2, 0x6

    .line 17
    if-eq p0, v2, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    if-ne p0, v2, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v1}, La/fq80;->N(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, La/fq80;->H()J

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p0, p1}, La/ieb;->V(ILa/fq80;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {p1, v0}, La/fq80;->M(I)V

    .line 33
    .line 34
    .line 35
    int-to-long p0, p0

    .line 36
    return-wide p0

    .line 37
    :cond_2
    const-wide/16 p0, -0x1

    .line 38
    .line 39
    return-wide p0
.end method

.method public abstract c(La/fq80;JLa/fck0;)Z
.end method

.method public d(Z)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, La/fck0;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {p1, v2, v3}, La/fck0;-><init>(BZ)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/orm0;->j:La/fck0;

    .line 13
    .line 14
    iput-wide v0, p0, La/orm0;->f:J

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-byte p1, p0, La/orm0;->h:B

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    iput-byte p1, p0, La/orm0;->h:B

    .line 22
    .line 23
    :goto_0
    const-wide/16 v2, -0x1

    .line 24
    .line 25
    iput-wide v2, p0, La/orm0;->e:J

    .line 26
    .line 27
    iput-wide v0, p0, La/orm0;->g:J

    .line 28
    .line 29
    return-void
.end method
