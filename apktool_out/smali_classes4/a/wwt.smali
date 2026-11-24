.class public final La/wwt;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/n0o0;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/khf0;

.field public l:I


# direct methods
.method public constructor <init>(La/khf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wwt;->k:La/khf0;

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
    iput-object p1, p0, La/wwt;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/wwt;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/wwt;->l:I

    .line 9
    .line 10
    iget-object p1, p0, La/wwt;->k:La/khf0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/khf0;->E(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
