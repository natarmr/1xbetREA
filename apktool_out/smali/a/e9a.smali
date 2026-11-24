.class public final La/e9a;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:I

.field public j:Ljava/lang/AutoCloseable;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/g9a;

.field public m:I


# direct methods
.method public constructor <init>(La/g9a;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/e9a;->l:La/g9a;

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
    iput-object p1, p0, La/e9a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/e9a;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/e9a;->m:I

    .line 9
    .line 10
    iget-object p1, p0, La/e9a;->l:La/g9a;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/g9a;->q(JLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
