.class public final La/dhf0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/n7p;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ehf0;

.field public l:I


# direct methods
.method public constructor <init>(La/ehf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dhf0;->k:La/ehf0;

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
    iput-object p1, p0, La/dhf0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/dhf0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/dhf0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, La/dhf0;->k:La/ehf0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/ehf0;->l(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
