.class public final La/nk0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/jk0;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/kb0;

.field public l:I


# direct methods
.method public constructor <init>(La/kb0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nk0;->k:La/kb0;

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
    iput-object p1, p0, La/nk0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nk0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nk0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, La/nk0;->k:La/kb0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/kb0;->p(La/jk0;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
