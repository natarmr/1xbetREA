.class public final La/gb50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/olz;


# instance fields
.field public final synthetic a:La/ba50;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(La/nlz;La/ba50;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/gb50;->a:La/ba50;

    .line 5
    .line 6
    iput-boolean p3, p0, La/gb50;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, La/gb50;->a:La/ba50;

    .line 2
    .line 3
    iget-boolean p0, p0, La/gb50;->b:Z

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/ba50;->a(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
