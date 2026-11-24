.class public final synthetic La/gmb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, La/gmb0;->a:Z

    iput-boolean p3, p0, La/gmb0;->b:Z

    iput-boolean p4, p0, La/gmb0;->c:Z

    iput-boolean p5, p0, La/gmb0;->d:Z

    iput-object p1, p0, La/gmb0;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/olb0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v2, La/olb0;->k:La/bib0;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const v4, 0x1f7ffff

    .line 21
    .line 22
    .line 23
    iget-boolean v5, v0, La/gmb0;->a:Z

    .line 24
    .line 25
    invoke-static {v1, v3, v5, v4}, La/bib0;->a(La/bib0;ZZI)La/bib0;

    .line 26
    .line 27
    .line 28
    move-result-object v15

    .line 29
    iget-object v3, v2, La/olb0;->j:La/idb0;

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/16 v10, 0x2d

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    iget-boolean v5, v0, La/gmb0;->b:Z

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    iget-boolean v7, v0, La/gmb0;->c:Z

    .line 39
    .line 40
    iget-boolean v9, v0, La/gmb0;->d:Z

    .line 41
    .line 42
    invoke-static/range {v3 .. v10}, La/idb0;->a(La/idb0;ZZZZZZI)La/idb0;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v17, 0x19fe

    .line 49
    .line 50
    iget-object v3, v0, La/gmb0;->e:Ljava/util/List;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const-wide/16 v9, 0x0

    .line 57
    .line 58
    const-wide/16 v11, 0x0

    .line 59
    .line 60
    const/4 v13, 0x0

    .line 61
    invoke-static/range {v2 .. v17}, La/olb0;->a(La/olb0;Ljava/util/List;La/amb0;La/ql5;ZZLjava/lang/String;JJZLa/idb0;La/bib0;La/skb0;I)La/olb0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
