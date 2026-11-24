.class public final La/rdo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bco0;


# instance fields
.field public final synthetic a:La/bco0;

.field public final b:La/mbo0;


# direct methods
.method public constructor <init>(La/mbo0;La/bco0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/rdo0;->a:La/bco0;

    .line 8
    .line 9
    iput-object p1, p0, La/rdo0;->b:La/mbo0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/mbo0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rdo0;->a:La/bco0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/bco0;->a(La/mbo0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, La/rdo0;->a:La/bco0;

    .line 2
    .line 3
    invoke-interface {p0}, La/bco0;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()La/noj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/rdo0;->a:La/bco0;

    .line 2
    .line 3
    invoke-interface {p0}, La/bco0;->c()La/noj0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
