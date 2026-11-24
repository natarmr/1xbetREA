.class public final La/sv70;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/kr5;

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/wv70;

.field public n:I


# direct methods
.method public constructor <init>(La/wv70;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sv70;->m:La/wv70;

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
    .locals 2

    .line 1
    iput-object p1, p0, La/sv70;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/sv70;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/sv70;->n:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/sv70;->m:La/wv70;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, v0, p0}, La/wv70;->k(La/kr5;IILa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
