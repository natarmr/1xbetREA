.class public final synthetic La/yj7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/luu;

.field public final synthetic b:La/vjp;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:D


# direct methods
.method public synthetic constructor <init>(La/luu;La/vjp;Ljava/lang/String;D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yj7;->a:La/luu;

    iput-object p2, p0, La/yj7;->b:La/vjp;

    iput-object p3, p0, La/yj7;->c:Ljava/lang/String;

    iput-wide p4, p0, La/yj7;->d:D

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/yj7;->a:La/luu;

    .line 2
    .line 3
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    sget-object v4, La/iun;->a:La/iun;

    .line 10
    .line 11
    iget-object v0, p0, La/yj7;->b:La/vjp;

    .line 12
    .line 13
    invoke-virtual {v0}, La/vjp;->d()La/k77;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    new-instance v1, La/uj7;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iget-object v6, p0, La/yj7;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-wide v7, p0, La/yj7;->d:D

    .line 23
    .line 24
    move-object v5, v4

    .line 25
    invoke-direct/range {v1 .. v9}, La/uj7;-><init>(La/a5w;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;DLa/k77;)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method
