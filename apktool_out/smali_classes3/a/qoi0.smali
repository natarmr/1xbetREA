.class public final La/qoi0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/j4g;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/y1u;

.field public l:I


# direct methods
.method public constructor <init>(La/y1u;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qoi0;->k:La/y1u;

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
    iput-object p1, p0, La/qoi0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/qoi0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/qoi0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, La/qoi0;->k:La/y1u;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/y1u;->a(La/j4g;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
