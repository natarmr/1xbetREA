.class public final La/p120;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/sw00;

.field public j:La/w220;

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/w220;

.field public n:I


# direct methods
.method public constructor <init>(La/w220;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p120;->m:La/w220;

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
    iput-object p1, p0, La/p120;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/p120;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/p120;->n:I

    .line 9
    .line 10
    iget-object p1, p0, La/p120;->m:La/w220;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/w220;->y(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
