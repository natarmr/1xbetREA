.class public final La/e73;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:La/nuj0;

.field public final b:Ljava/util/ArrayList;

.field public final c:La/yk50;

.field public final d:La/w1;

.field public final e:La/xex;

.field public f:Z

.field public g:F

.field public h:La/c5k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/e73;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/xex;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nuj0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, La/nuj0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/e73;->a:La/nuj0;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/e73;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, La/yk50;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {v0, p0, v2}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/e73;->c:La/yk50;

    .line 26
    .line 27
    new-instance v0, La/w1;

    .line 28
    .line 29
    const/4 v2, 0x7

    .line 30
    invoke-direct {v0, p0, v2}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/e73;->d:La/w1;

    .line 34
    .line 35
    iput-boolean v1, p0, La/e73;->f:Z

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    iput v0, p0, La/e73;->g:F

    .line 40
    .line 41
    iput-object p1, p0, La/e73;->e:La/xex;

    .line 42
    .line 43
    return-void
.end method

.method public static a()La/e73;
    .locals 4

    .line 1
    sget-object v0, La/e73;->i:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, La/e73;

    .line 10
    .line 11
    new-instance v2, La/xex;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iput-object v3, v2, La/xex;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iput-object v3, v2, La/xex;->b:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {v1, v2}, La/e73;-><init>(La/xex;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/e73;

    .line 39
    .line 40
    return-object v0
.end method
