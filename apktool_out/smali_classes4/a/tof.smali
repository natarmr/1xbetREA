.class public final La/tof;
.super La/uof;
.source "SourceFile"


# static fields
.field public static final f:La/tof;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/tof;

    .line 2
    .line 3
    new-instance v1, La/oif;

    .line 4
    .line 5
    new-instance v2, La/qqf;

    .line 6
    .line 7
    const/16 v3, 0x30

    .line 8
    .line 9
    const/16 v4, 0x1e

    .line 10
    .line 11
    invoke-direct {v2, v3, v4}, La/qqf;-><init>(II)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/qqf;

    .line 15
    .line 16
    const/16 v4, -0x27

    .line 17
    .line 18
    const/16 v5, 0x5c

    .line 19
    .line 20
    invoke-direct {v3, v4, v5}, La/qqf;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, La/oif;-><init>(La/qqf;La/qqf;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/hrf;

    .line 27
    .line 28
    new-instance v3, La/hpf;

    .line 29
    .line 30
    const/16 v4, 0x2da0

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-direct {v3, v4, v5}, La/hpf;-><init>(II)V

    .line 34
    .line 35
    .line 36
    new-instance v4, La/ipf;

    .line 37
    .line 38
    const v5, 0x3e4ccccd    # 0.2f

    .line 39
    .line 40
    .line 41
    const v6, -0x3dd5999a    # -42.6f

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, v5, v6}, La/ipf;-><init>(FF)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3, v4}, La/hrf;-><init>(La/hpf;La/ipf;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/16 v4, 0xed8

    .line 55
    .line 56
    const v5, 0x409eb852    # 4.96f

    .line 57
    .line 58
    .line 59
    const/16 v3, 0xf32

    .line 60
    .line 61
    invoke-direct/range {v0 .. v5}, La/uof;-><init>(La/oif;Ljava/util/List;IIF)V

    .line 62
    .line 63
    .line 64
    sput-object v0, La/tof;->f:La/tof;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, La/tof;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x27ca8fe0

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Vertigo"

    .line 2
    .line 3
    return-object p0
.end method
