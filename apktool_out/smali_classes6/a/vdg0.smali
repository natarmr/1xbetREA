.class public final La/vdg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/sgy;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Ljava/util/concurrent/Executor;

.field public h:La/qty;

.field public i:Z

.field public final j:La/ea70;

.field public final k:Ljava/util/LinkedHashSet;

.field public final l:Ljava/util/LinkedHashSet;

.field public final m:Ljava/util/ArrayList;

.field public n:Z

.field public o:Z

.field public p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/vdg0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/vdg0;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v0, La/ydg0;->a:La/ydg0;

    .line 19
    .line 20
    new-instance v0, La/ea70;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, v1}, La/ea70;-><init>(B)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/vdg0;->j:La/ea70;

    .line 27
    .line 28
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/vdg0;->k:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/vdg0;->l:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/vdg0;->m:Ljava/util/ArrayList;

    .line 48
    .line 49
    iput-boolean v1, p0, La/vdg0;->n:Z

    .line 50
    .line 51
    sget-object v0, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    const-class v1, Landroidx/work/impl/WorkDatabase;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/vdg0;->a:La/sgy;

    .line 60
    .line 61
    iput-object p1, p0, La/vdg0;->b:Landroid/content/Context;

    .line 62
    .line 63
    iput-object p2, p0, La/vdg0;->c:Ljava/lang/String;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final varargs a([La/eg40;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    iget-byte v4, v3, La/eg40;->a:B

    .line 9
    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, La/vdg0;->l:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-byte v3, v3, La/eg40;->b:B

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v0, p1

    .line 32
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [La/eg40;

    .line 37
    .line 38
    array-length v0, p1

    .line 39
    :goto_1
    if-ge v1, v0, :cond_1

    .line 40
    .line 41
    aget-object v2, p1, v1

    .line 42
    .line 43
    iget-object v3, p0, La/vdg0;->j:La/ea70;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/ea70;->a(La/eg40;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    return-void
.end method
