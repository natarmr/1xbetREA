.class public final La/nl60;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/kmq;

.field public j:Ljava/util/Iterator;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/ol60;

.field public m:I


# direct methods
.method public constructor <init>(La/ol60;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nl60;->l:La/ol60;

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
    iput-object p1, p0, La/nl60;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nl60;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nl60;->m:I

    .line 9
    .line 10
    iget-object p1, p0, La/nl60;->l:La/ol60;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/ol60;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, La/wne;->a:La/wne;

    .line 17
    .line 18
    return-object p0
.end method
