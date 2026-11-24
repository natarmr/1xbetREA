.class public final La/r8m0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/gbi0;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/x68;

.field public l:I


# direct methods
.method public constructor <init>(La/x68;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/r8m0;->k:La/x68;

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
    iput-object p1, p0, La/r8m0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/r8m0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/r8m0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, La/r8m0;->k:La/x68;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/x68;->a(La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
