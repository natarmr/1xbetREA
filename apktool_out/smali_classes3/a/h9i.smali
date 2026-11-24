.class public final La/h9i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h9i;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 3

    .line 1
    new-instance v0, La/zr4;

    .line 2
    .line 3
    iget-object p0, p0, La/h9i;->a:La/n8i;

    .line 4
    .line 5
    iget-object p0, p0, La/n8i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/i9i;

    .line 8
    .line 9
    iget-object v1, p0, La/i9i;->a:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, La/i9i;->b:La/rou;

    .line 16
    .line 17
    iget-object p0, p0, La/i9i;->c:La/i1w0;

    .line 18
    .line 19
    invoke-direct {v0, p1, v1, v2, p0}, La/zr4;-><init>(La/vzg0;ZLa/rou;La/i1w0;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
