.class public final synthetic La/dld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wn30;


# instance fields
.field public final synthetic a:La/gld;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gld;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dld;->a:La/gld;

    iput-object p2, p0, La/dld;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(La/e06;La/bmq0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/dld;->a:La/gld;

    .line 2
    .line 3
    iget-object p0, p0, La/dld;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, La/gld;->v(Ljava/lang/Object;La/e06;La/bmq0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
