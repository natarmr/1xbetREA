.class public final La/oi80;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:La/qi80;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/r980;

.field public s:I


# direct methods
.method public constructor <init>(La/r980;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oi80;->r:La/r980;

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
    iput-object p1, p0, La/oi80;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/oi80;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/oi80;->s:I

    .line 9
    .line 10
    iget-object p1, p0, La/oi80;->r:La/r980;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/r980;->b(La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
