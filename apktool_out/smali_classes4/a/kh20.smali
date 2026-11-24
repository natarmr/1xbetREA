.class public final synthetic La/kh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, La/kh20;->a:Z

    iput-boolean p3, p0, La/kh20;->b:Z

    iput p1, p0, La/kh20;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/oyg0;

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    check-cast v0, La/sg20;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, La/kh20;->a:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p1, La/bo7;->a:La/bo7;

    .line 17
    .line 18
    :goto_0
    move-object v3, p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p1, v0, La/sg20;->d:La/eo7;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    iget-object v4, v0, La/sg20;->f:La/ifc0;

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    const/16 v11, 0x3f

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    iget-boolean v10, p0, La/kh20;->b:Z

    .line 33
    .line 34
    invoke-static/range {v4 .. v11}, La/ifc0;->a(La/ifc0;La/azc0;La/plc0;ZZZZI)La/ifc0;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/16 v10, 0x3d7

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    iget v9, p0, La/kh20;->c:I

    .line 45
    .line 46
    invoke-static/range {v0 .. v10}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
