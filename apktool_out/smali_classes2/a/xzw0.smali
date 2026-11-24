.class public final La/xzw0;
.super La/j1x0;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/Set;


# instance fields
.field public final a:La/vzw0;

.field public final b:La/uzw0;

.field public final c:La/wzw0;

.field public final d:La/p50;

.field public final e:La/fpw0;

.field public final f:La/icw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/cpw0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, La/cpw0;->zza()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    sput-object v0, La/xzw0;->g:Ljava/util/Set;

    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-static {v0}, La/itt0;->s(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(La/vzw0;La/uzw0;La/wzw0;La/fpw0;La/p50;La/icw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xzw0;->a:La/vzw0;

    .line 5
    .line 6
    iput-object p2, p0, La/xzw0;->b:La/uzw0;

    .line 7
    .line 8
    iput-object p3, p0, La/xzw0;->c:La/wzw0;

    .line 9
    .line 10
    iput-object p4, p0, La/xzw0;->e:La/fpw0;

    .line 11
    .line 12
    iput-object p5, p0, La/xzw0;->d:La/p50;

    .line 13
    .line 14
    iput-object p6, p0, La/xzw0;->f:La/icw0;

    .line 15
    .line 16
    return-void
.end method

.method public static b()La/zcw0;
    .locals 3

    .line 1
    new-instance v0, La/zcw0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, La/zcw0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v1, v0, La/zcw0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v1, v0, La/zcw0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, v0, La/zcw0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v2, La/p50;->n:La/p50;

    .line 16
    .line 17
    iput-object v2, v0, La/zcw0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v1, v0, La/zcw0;->f:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/xzw0;->d:La/p50;

    .line 2
    .line 3
    sget-object v0, La/p50;->n:La/p50;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, La/xzw0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, La/xzw0;

    .line 8
    .line 9
    iget-object v0, p1, La/xzw0;->a:La/vzw0;

    .line 10
    .line 11
    iget-object v2, p0, La/xzw0;->a:La/vzw0;

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p1, La/xzw0;->b:La/uzw0;

    .line 17
    .line 18
    iget-object v2, p0, La/xzw0;->b:La/uzw0;

    .line 19
    .line 20
    if-eq v0, v2, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p1, La/xzw0;->c:La/wzw0;

    .line 24
    .line 25
    iget-object v2, p0, La/xzw0;->c:La/wzw0;

    .line 26
    .line 27
    if-eq v0, v2, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p1, La/xzw0;->e:La/fpw0;

    .line 31
    .line 32
    iget-object v2, p0, La/xzw0;->e:La/fpw0;

    .line 33
    .line 34
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v0, p1, La/xzw0;->d:La/p50;

    .line 41
    .line 42
    iget-object v2, p0, La/xzw0;->d:La/p50;

    .line 43
    .line 44
    if-eq v0, v2, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object p1, p1, La/xzw0;->f:La/icw0;

    .line 48
    .line 49
    iget-object p0, p0, La/xzw0;->f:La/icw0;

    .line 50
    .line 51
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_5

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v5, p0, La/xzw0;->d:La/p50;

    .line 2
    .line 3
    iget-object v6, p0, La/xzw0;->f:La/icw0;

    .line 4
    .line 5
    const-class v0, La/xzw0;

    .line 6
    .line 7
    iget-object v1, p0, La/xzw0;->a:La/vzw0;

    .line 8
    .line 9
    iget-object v2, p0, La/xzw0;->b:La/uzw0;

    .line 10
    .line 11
    iget-object v3, p0, La/xzw0;->c:La/wzw0;

    .line 12
    .line 13
    iget-object v4, p0, La/xzw0;->e:La/fpw0;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v4, p0, La/xzw0;->d:La/p50;

    .line 2
    .line 3
    iget-object v5, p0, La/xzw0;->f:La/icw0;

    .line 4
    .line 5
    iget-object v0, p0, La/xzw0;->a:La/vzw0;

    .line 6
    .line 7
    iget-object v1, p0, La/xzw0;->b:La/uzw0;

    .line 8
    .line 9
    iget-object v2, p0, La/xzw0;->c:La/wzw0;

    .line 10
    .line 11
    iget-object v3, p0, La/xzw0;->e:La/fpw0;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)"

    .line 18
    .line 19
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
