.class public final La/ctv0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/svv0;

.field public j:La/awv0;

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/etv0;

.field public n:I


# direct methods
.method public constructor <init>(La/etv0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ctv0;->m:La/etv0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/ctv0;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ctv0;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ctv0;->n:I

    .line 9
    .line 10
    iget-object p1, p0, La/ctv0;->m:La/etv0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/etv0;->Z0(La/svv0;La/awv0;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
