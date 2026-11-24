.class public final La/usw0;
.super La/qqw0;
.source "SourceFile"


# instance fields
.field public final a:La/tsw0;

.field public final b:La/icw0;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(La/tsw0;La/icw0;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/usw0;->a:La/tsw0;

    .line 5
    .line 6
    iput-object p2, p0, La/usw0;->b:La/icw0;

    .line 7
    .line 8
    iput-object p3, p0, La/usw0;->c:Ljava/lang/Integer;

    .line 9
    .line 10
    return-void
.end method

.method public static v(La/tsw0;Ljava/lang/Integer;)La/usw0;
    .locals 3

    .line 1
    iget-object v0, p0, La/tsw0;->a:La/hbb;

    .line 2
    .line 3
    sget-object v1, La/hbb;->o:La/hbb;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "For given Variant NO_PREFIX the value of idRequirement must be null"

    .line 14
    .line 15
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    sget-object v1, La/hbb;->n:La/hbb;

    .line 20
    .line 21
    if-ne v0, v1, :cond_3

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    new-instance v1, La/usw0;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0, p1}, La/usw0;-><init>(La/tsw0;La/icw0;Ljava/lang/Integer;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    const-string p0, "For given Variant TINK the value of idRequirement must be non-null"

    .line 40
    .line 41
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "Unknown Variant: "

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method


# virtual methods
.method public final synthetic s()La/fpw0;
    .locals 0

    .line 1
    iget-object p0, p0, La/usw0;->a:La/tsw0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, La/usw0;->c:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u()La/icw0;
    .locals 0

    .line 1
    iget-object p0, p0, La/usw0;->b:La/icw0;

    .line 2
    .line 3
    return-object p0
.end method
