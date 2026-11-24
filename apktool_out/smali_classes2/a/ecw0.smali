.class public final La/ecw0;
.super La/dwb;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/Set;

.field public final c:La/cmt0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La/dwb;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, La/gcw0;->f:Ljava/util/Set;

    .line 7
    .line 8
    iput-object p1, p0, La/ecw0;->b:Ljava/util/Set;

    .line 9
    .line 10
    sget-object p1, La/gcw0;->g:La/cmt0;

    .line 11
    .line 12
    iput-object p1, p0, La/ecw0;->c:La/cmt0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/lfx0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, La/lfx0;->c()La/wgm0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/nhx0;->a:La/vgx0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/wgm0;->C(La/vgx0;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La/dwb;->a:Ljava/lang/String;

    .line 16
    .line 17
    :cond_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, La/lfx0;->d:La/jgx0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, La/jgx0;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0x2e

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x24

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ltz v1, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "cannot request log site information prior to postProcess()"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    :goto_0
    sget-object v1, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 54
    .line 55
    iget-object v2, p0, La/ecw0;->c:La/cmt0;

    .line 56
    .line 57
    invoke-static {v0}, La/aem0;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object p0, p0, La/ecw0;->b:Ljava/util/Set;

    .line 62
    .line 63
    invoke-static {p1, v0, v1, p0, v2}, La/gcw0;->d(La/lfx0;Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;La/cmt0;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
