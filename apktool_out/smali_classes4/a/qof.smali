.class public final La/qof;
.super La/uof;
.source "SourceFile"


# static fields
.field public static final f:La/qof;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/qof;

    .line 2
    .line 3
    new-instance v1, La/oif;

    .line 4
    .line 5
    new-instance v2, La/qqf;

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    const/16 v4, 0x37

    .line 10
    .line 11
    invoke-direct {v2, v3, v4}, La/qqf;-><init>(II)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/qqf;

    .line 15
    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    const/16 v5, -0x38

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
    const/16 v4, -0x1e2

    .line 31
    .line 32
    const/16 v5, -0x9c4

    .line 33
    .line 34
    invoke-direct {v3, v4, v5}, La/hpf;-><init>(II)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/ipf;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/high16 v6, -0x3dc80000    # -46.0f

    .line 41
    .line 42
    invoke-direct {v4, v5, v6}, La/ipf;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, v4}, La/hrf;-><init>(La/hpf;La/ipf;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v4, 0x1766

    .line 53
    .line 54
    const v5, 0x40df5c29    # 6.98f

    .line 55
    .line 56
    .line 57
    const/16 v3, 0xcda

    .line 58
    .line 59
    invoke-direct/range {v0 .. v5}, La/uof;-><init>(La/oif;Ljava/util/List;IIF)V

    .line 60
    .line 61
    .line 62
    sput-object v0, La/qof;->f:La/qof;

    .line 63
    .line 64
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
    instance-of p0, p1, La/qof;

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
    const p0, 0x167e9c1

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Nuke"

    .line 2
    .line 3
    return-object p0
.end method
