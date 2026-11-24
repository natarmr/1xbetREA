.class public final La/yyn0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/Throwable;

.field public j:La/kka;

.field public k:La/bpn0;

.field public l:La/fuj0;

.field public m:La/i050;

.field public n:Ljava/util/List;

.field public o:Ljava/util/Iterator;

.field public p:Ljava/util/List;

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/zyn0;

.field public t:I


# direct methods
.method public constructor <init>(La/zyn0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yyn0;->s:La/zyn0;

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
    iput-object p1, p0, La/yyn0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/yyn0;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/yyn0;->t:I

    .line 9
    .line 10
    iget-object p1, p0, La/yyn0;->s:La/zyn0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, La/zyn0;->a0(Ljava/lang/Throwable;La/kka;La/bpn0;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
