.class public final La/zyn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nyq0;


# instance fields
.field public final a:La/oyq0;

.field public final b:La/nul0;

.field public final c:La/sjj;

.field public final d:Lkotlin/jvm/functions/Function0;

.field public final e:La/c3d;


# direct methods
.method public constructor <init>(La/sjj;La/nul0;La/oyq0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/zyn;->a:La/oyq0;

    .line 5
    .line 6
    iput-object p2, p0, La/zyn;->b:La/nul0;

    .line 7
    .line 8
    iput-object p1, p0, La/zyn;->c:La/sjj;

    .line 9
    .line 10
    iput-object p4, p0, La/zyn;->d:Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    new-instance p1, La/c3d;

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    invoke-direct {p1, p0, p2}, La/c3d;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/zyn;->e:La/c3d;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()La/vj50;
    .locals 0

    .line 1
    iget-object p0, p0, La/zyn;->e:La/c3d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/sjj;
    .locals 0

    .line 1
    iget-object p0, p0, La/zyn;->c:La/sjj;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/j73;
    .locals 0

    .line 1
    iget-object p0, p0, La/zyn;->b:La/nul0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getState()La/oyq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zyn;->a:La/oyq0;

    .line 2
    .line 3
    return-object p0
.end method
