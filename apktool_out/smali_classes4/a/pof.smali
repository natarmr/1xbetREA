.class public final La/pof;
.super La/uof;
.source "SourceFile"


# static fields
.field public static final f:La/pof;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/pof;

    .line 2
    .line 3
    new-instance v1, La/oif;

    .line 4
    .line 5
    new-instance v2, La/qqf;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3, v3}, La/qqf;-><init>(II)V

    .line 9
    .line 10
    .line 11
    new-instance v4, La/qqf;

    .line 12
    .line 13
    invoke-direct {v4, v3, v3}, La/qqf;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v4}, La/oif;-><init>(La/qqf;La/qqf;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/iun;->a:La/iun;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-direct/range {v0 .. v5}, La/uof;-><init>(La/oif;Ljava/util/List;IIF)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/pof;->f:La/pof;

    .line 27
    .line 28
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
    instance-of p0, p1, La/pof;

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
    const p0, -0x6e966d5c

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NoneMap"

    .line 2
    .line 3
    return-object p0
.end method
