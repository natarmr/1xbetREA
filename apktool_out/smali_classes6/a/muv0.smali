.class public final La/muv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h0q0;

.field public final b:La/fht0;

.field public c:Z

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public final i:La/pz40;


# direct methods
.method public constructor <init>(La/h0q0;La/fht0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/muv0;->a:La/h0q0;

    .line 5
    .line 6
    iput-object p2, p0, La/muv0;->b:La/fht0;

    .line 7
    .line 8
    sget-object p1, La/zsv0;->a:La/zsv0;

    .line 9
    .line 10
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/muv0;->i:La/pz40;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/muv0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, La/muv0;->a:La/h0q0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/h0q0;->l()La/bsv0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/bsv0;->a:La/esv0;

    .line 14
    .line 15
    instance-of v0, v0, La/dsv0;

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object p0, p0, La/muv0;->i:La/pz40;

    .line 22
    .line 23
    check-cast p0, La/hgk0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/atv0;

    .line 30
    .line 31
    instance-of v0, p0, La/xsv0;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p0, La/xsv0;

    .line 36
    .line 37
    iget p0, p0, La/xsv0;->a:I

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    instance-of v0, p0, La/ysv0;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p0, La/ysv0;

    .line 49
    .line 50
    iget p0, p0, La/ysv0;->a:I

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    sget-object v0, La/zsv0;->a:La/zsv0;

    .line 58
    .line 59
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    :goto_1
    return-object v1

    .line 66
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget p0, p0, La/muv0;->d:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
